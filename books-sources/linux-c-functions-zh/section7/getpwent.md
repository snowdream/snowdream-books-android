getpwent（从密码文件中取得账号的数据）
<pre>相关函数
getpw，fgetpwent，getpwnam，getpwuid，setpwent，endpwent
表头文件
#include< pwd.h>
#include< sys/types.h>
定义函数
strcut passwd * getpwent(void);
函数说明
getpwent（）用来从密码文件（/etc/passwd）中读取一项用户数据，该用户的数据以passwd 结构返回。第一次调用时会取得第一位用户数据，之后每调用一次就会返回下一项数据，直到已无任何数据时返回NULL。
passwd 结构定义如下
struct passwd{
char * pw_name; /*用户账号*/
char * pw_passwd; /*用户密码*/
uid_t pw_uid; /*用户识别码*/
gid_t pw_gid; /*组识别码*/
char * pw_gecos; /*用户全名*/
char * pw_dir; /*家目录*/
char * pw_shell; /* 所使用的shell路径*/
};
返回值
返回passwd 结构数据，如果返回NULL 则表示已无数据，或有错误发生。
附加说明
getpwent()在第一次调用时会打开密码文件，读取数据完毕后可使用endpwent()来关闭该密码文件。错误代码ENOMEM 内存不足，无法配置passwd结构。
范例
#include< pwd.h>
#include< sys/types.h>
main()
{
struct passwd *user;
while((user = getpwent())!=0){
printf(“%s:%d:%d:%s:%s:%s\n”,user->pw_name,user->pw_uid,user->pw_gid,
user->pw_gecos,user->pw_dir,user->pw_shell);
}
endpwent();
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
kids:500:500: : /home/kids:/bin/bash</pre>