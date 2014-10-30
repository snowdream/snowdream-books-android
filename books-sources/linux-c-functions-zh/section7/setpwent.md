setpwent（从头读取密码文件中的账号数据）
相关函数
getpwent，endpwent
表头文件
#include<pwd.h>
#include<sys/types.h>
定义函数
void setpwent(void);
函数说明
setpwent()用来将getpwent()的读写地址指回密码文件开头。
返回值

范例
#include<pwd.h>
#include<sys/types.h>
main()
{
struct passwd *user;
int i;
for(i=0;i<4;i++){
user=getpwent();
printf(“%s :%d :%d :%s:%s:%s\n”,user->pw_name,user->pw_uid,user->pw_gid,
user->pw_gecos,user->pw_dir,user->pw_shell);
}
setpwent();
user=getpwent();
printf(“%s :%d :%d :%s:%s:%s\n”,user->pw_name,user->pw_uid,user->pw_gid,
user->pw_gecos,user->pw_dir,user->pw_shell);
endpwent();
}
执行
root:0:0:root:/root:/bin/bash
bin:1:1:bin:/bin
daemon:2:2:daemon:/sbin
adm:3:4:adm:/var/adm
root:0:0:root:/root:/bin/bash