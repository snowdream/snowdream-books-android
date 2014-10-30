getpw（取得指定用户的密码文件数据）
相关函数
getpwent
表头文件
#include<pwd.h>
#include<sys/types.h>
定义函数
int getpw(uid_t uid,char *buf);
函数说明
getpw()会从/etc/passwd中查找符合参数uid所指定的用户账号数据，找不到相关数据就返回-1。所返回的buf字符串格式如下:账号:密码:用户识别码(uid):组识别码(gid):全名:根目录:shell
返回值
返回0表示成功，有错误发生时返回-1。
附加说明
1. getpw()会有潜在的安全性问题，请尽量使用别的函数取代。
2. 使用shadow的系统已把用户密码抽出/etc/passwd，因此使用getpw()取得的密码将为“x”。
范例
#include<pwd.h>
#include<sys/types.h>
main()
{
char buffer[80];
getpw(0,buffer);
printf(“%s\n”,buffer);
}
执行
root:x:0:0:root:/root:/bin/bash