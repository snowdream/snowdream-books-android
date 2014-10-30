chdir（改变当前的工作（目录）
相关函数
getcwd，chroot
表头文件
#include<unistd.h>
定义函数
int chdir(const char * path);
函数说明
chdir()用来将当前的工作目录改变成以参数path所指的目录。
返回值
执行成功则返回0，失败返回-1，errno为错误代码。
范例
#include<unistd.h>
main()
{
chdir(“/tmp”);
printf(“current working directory: %s\n”,getcwd(NULL,NULL));
}
执行
current working directory :/tmp