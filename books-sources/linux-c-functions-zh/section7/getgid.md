getgid（取得真实的组识别码）
相关函数
getegid，setregid，setgid
表头文件
#include<unistd.h>
#include<sys/types.h>
定义函数
gid_t getgid(void);
函数说明
getgid()用来取得执行目前进程的组识别码。
返回值
返回组识别码
范例
main()
{
printf(“gid is %d\n”,getgid());
}
执行
gid is 0 /*当使用root身份执行范例程序时*/