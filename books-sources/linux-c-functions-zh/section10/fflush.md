fflush（更新缓冲区）
相关函数
write，fopen，fclose，setbuf
表头文件
#include<stdio.h>
定义函数
int fflush(FILE* stream);
函数说明
fflush()会强迫将缓冲区内的数据写回参数stream指定的文件中。如果参数stream为NULL，fflush()会将所有打开的文件数据更新。
返回值
成功返回0，失败返回EOF，错误代码存于errno中。
错误代码
EBADF 参数stream 指定的文件未被打开，或打开状态为只读。其它错误代码参考write（）。