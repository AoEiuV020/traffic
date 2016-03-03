#	***************************************************
#		^> File Name: makefile
#		^> Author: AoEiuV020
#		^> Mail: 490674483@qq.com
#		^> Created Time: 2015/12/23 - 20:28:14
#	***************************************************
name=traffic
pack="com.aoeiuv.traffic"
.PHONY:all ndk build install start
all:build install start
	echo OK...

ndk:
	ndk-build

build:
	ant debug

install:
	adb install -r bin/$(name)-debug.apk

start:
	adb shell am start -n $(pack)/.Main
