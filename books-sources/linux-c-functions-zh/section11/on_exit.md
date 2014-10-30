on_exit（设置程序正常结束前调用的函数）
相关函数
_exit，atexit，exit
表头文件
#include<stdlib.h>
定义函数
int on_exit(void (* function)(int, void*),void *arg);
函数说明
on_exit()用来设置一个程序正常结束前调用的函数。当程序通过调用exit()或从main中返回时，参数function所指定的函数会先被调用，然后才真正由exit()结束程序。参数arg指针会传给参数function函数，详细情况请见范例。
返回值
如果执行成功则返回0，否则返回-1，失败原因存于errno中。
附加说明

范例
#include<stdlib.h>
void my_exit(int status,void *arg)
{
printf(“before exit()!\n”);
printf(“exit (%d)\n”,status);
printf(“arg = %s\n”,(char*)arg);
}
main()
{
char * str=”test”;
on_exit(my_exit,(void *)str);
exit(1234);
}
执行
before exit()!
exit (1234)
arg = test