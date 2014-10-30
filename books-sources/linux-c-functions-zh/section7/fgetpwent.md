fgetpwent（从指定的文件来读取密码格式）
相关函数
fgetgrent
表头文件
#include<pwd.h>
#include<stdio.h>
#include<sys/types.h>
定义函数
struct passwd * fgetpwent(FILE *stream);
函数说明
fgetpwent()会从参数stream指定的文件读取一行数据，然后以passwd结构将该数据返回。参数stream所指定的文件必须和/etc/passwd相同的格式。passwd结构定义请参考getpwent()。
返回值
返回passwd结构数据，如果返回NULL则表示已无数据，或有错误发生。
范例
#include<pwd.h>
#include<sys/types.h>
main()
{
struct passwd *user;
FILE *stream;
stream = fopen("/etc/passwd", "r");
while((user = fgetpwent(stream))!=0){
printf("%s:%d:%d:%s:%s:%s\n",user->pw_name,user->pw_uid,user->pw_gid,user->pw_gecos,user->pw_dir,user->pw_shell);
}
}
执行
root:0:0:root:/root:/bin/bash
bin:1:1:bin:/bin:
daemon:2:2:daemon:/sbin:
adm:3:4:adm:/var/adm:
lp:4:7:lp:/var/spool/lpd:
sync:5:0:sync:/sbin:/bin/sync
shutdown:6:0:shutdown:/sbin:/sbin/shutdown
halt:7:0:halt:/sbin:/sbin/halt
mail:8:12:mail:/var/spool/mail:
news:9:13:news:var/spool/news
uucp:10:14:uucp:/var/spool/uucp:
operator:11:0:operator :/root:
games:12:100:games:/usr/games:
gopher:13:30:gopher:/usr/lib/gopher-data:
ftp:14:50:FTP User:/home/ftp:
nobody:99:99:Nobody:/:
xfs:100:101:X Font Server: /etc/Xll/fs:/bin/false
gdm:42:42:/home/gdm:/bin/bash
kids:500:500: : /home/kids:/bin/bash