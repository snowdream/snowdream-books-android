strerror（返回错误原因的描述字符串）
相关函数
perror
表头文件
#include<string.h>
定义函数
char * strerror(int errnum);
函数说明
strerror()用来依参数errnum的错误代码来查询其错误原因的描述字符串，然后将该字符串指针返回。
返回值
返回描述错误原因的字符串指针。
范例
/* 显示错误代码0 至9 的错误原因描述*/
#include<string.h>
main()
{
int i;
for(i=0;i<10;i++)
printf(“%d : %s\n”,i,strerror(i));
}
执行
0 : Success
1 : Operation not permitted
2 : No such file or directory
3 : No such process
4 : Interrupted system call
5 : Input/output error
6 : Device not configured
7 : Argument list too long
8 : Exec format error
9 : Bad file descriptor
　
