getegid（取得有效的组识别码）
<pre>相关函数
getgid，setgid，setregid
表头文件
#include< unistd.h>
#include< sys/types.h>
定义函数
gid_t getegid(void);
函数说明
getegid()用来取得执行目前进程有效组识别码。有效的组识别码用来决定进程执行时组的权限。返回值返回有效的组识别码。
范例
main()
{ 
printf("egid is %d\n",getegid());
}
执行
egid is 0 /*当使用root身份执行范例程序时*/</pre>