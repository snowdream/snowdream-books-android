geteuid（取得有效的用户识别码）
<pre>相关函数
getuid，setreuid，setuid
表头文件
#include< unistd.h>
#include< sys/types.h>
定义函数
uid_t geteuid(void)
函数说明
geteuid()用来取得执行目前进程有效的用户识别码。有效的用户识别码用来决定进程执行的权限，借由此改变此值，进程可以获得额外的权限。倘若执行文件的setID位已被设置，该文件执行时，其进程的euid值便会设成该文件所有者的uid。例如，执行文件/usr/bin/passwd的权限为-r-s--x--x，其s 位即为setID(SUID)位，而当任何用户在执行passwd 时其有效的用户识别码会被设成passwd 所有者的uid 值，即root的uid 值(0)。
返回值
返回有效的用户识别码。
范例
main()
{ 
printf ("euid is %d \n",geteuid());
}
执行
euid is 0 /*当使用root身份执行范例程序时*/</pre>