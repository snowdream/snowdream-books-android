setpgrp（设置进程组识别码）
相关函数
getpgid，setpgid，getpgrp
表头文件
#include<unistd.h>
定义函数
int setpgrp(void);
函数说明
setpgrp()将目前进程所属的组识别码设为目前进程的进程识别码。此函数相当于调用setpgid(0,0)。
返回值
执行成功则返回组识别码，如果有错误则返回-1，错误原因存于errno中。