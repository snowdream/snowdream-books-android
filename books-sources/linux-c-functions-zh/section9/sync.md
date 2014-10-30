sync（将缓冲区数据写回磁盘）
相关函数
fsync
表头文件
#include<unistd.h>
定义函数
int sync(void)
函数说明
sync()负责将系统缓冲区数据写回磁盘，以确保数据同步。
返回值
返回0。