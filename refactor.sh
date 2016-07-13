#!/bin/sh

#group名称，例:com.weidian.pay
groupName=$1
#项目名称，例：pay-channel
projectName=$2

#替换group
sed -i "" "s/com.zmannotes.spring/$groupName/" pom.xml
#移动文件到新的目录，目录为group和projectName拼接而成路径
packageName=$groupName/`echo ${projectName//-\/}`
dir=`echo ${packageName//\./\/}`
mkdir -p src/main/java/$dir
mv src/main/java/com/zmannotes/spring/* src/main/java/$dir
#删除旧目录
rm -rf src/main/java/com/zmannotes
#替换projectName
sed -i "" "s/spring-basic-application/$projectName/g" pom.xml
mv ../spring-basic-application ../$projectName
