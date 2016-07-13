#!/bin/sh

#group名称，例:com.weidian.pay
groupName=$1
#项目名称，例：pay-channel
projectName=$2

#替换group
sed -i "" "s/com.zmannotes.spring/$groupName/" pom.xml
#替换projectName
sed -i "" "s/spring-basic-application/$projectName/g" pom.xml
mv ../spring-basic-application ../$projectName
