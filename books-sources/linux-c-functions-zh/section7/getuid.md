getuid（取得真实的用户识别码）
<pre>相关函数
geteuid，setreuid，setuid
表头文件
#include< unistd.h>
#include< sys/types.h>
定义函数
uid_t getuid(void);
函数说明
getuid()用来取得执行目前进程的用户识别码。
返回值
用户识别码
范例
main()
{ 
printf(“uid is %d\n”,getuid());
}
执行
uid is 0 /*当使用root身份执行范例程序时*/</pre>