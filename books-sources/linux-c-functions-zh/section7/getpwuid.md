getpwuid（从密码文件中取得指定uid 的数据）
<pre>相关函数
getpw，fgetpwent，getpwent，getpwnam
表头文件
#include< pwd.h>
#include< sys/types.h>
定义函数
struct passwd * getpwuid(uid_t uid);
函数说明
getpwuid()用来逐一搜索参数uid 指定的用户识别码，找到时便将该用户的数据以结构返回结构请参考将该用户的数据以passwd 结构返回。passwd 结构请参考getpwent()。
返回值
返回passwd 结构数据，如果返回NULL 则表示已无数据，或者有错误发生。
范例
#include< pwd.h>
#include< sys/types.h>
main()
{
struct passwd *user;
user= getpwuid(6);
printf(“name:%s\n”,user->pw_name);
printf(“uid:%d\n”,user->pw_uid);
printf(“home:%s\n”,user->pw_dir);
}
执行
name:shutdown
uid:6
home:/sbin</pre>