getpgrp（取得进程组识别码）
相关函数
setpgid，getpgid，getpgrp
表头文件
#include<unistd.h>
定义函数
pid_t getpgrp(void);
函数说明
getpgrp()用来取得目前进程所属的组识别码。此函数相当于调用getpgid(0)；
返回值
返回目前进程所属的组识别码。
范例
#include<unistd.h>
main()
{
printf(“my gid =%d\n”,getpgrp());
}
执行
my gid =29546