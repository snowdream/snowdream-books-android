munmap（解除内存映射）
相关函数
mmap
表头文件
#include<unistd.h>
#include<sys/mman.h>
定义函数
int munmap(void *start,size_t length);
函数说明
munmap()用来取消参数start所指的映射内存起始地址，参数length则是欲取消的内存大小。当进程结束或利用exec相关函数来执行其他程序时，映射内存会自动解除，但关闭对应的文件描述词时不会解除映射。
返回值
如果解除映射成功则返回0，否则返回－1，错误原因存于errno中错误代码EINVAL
参数
start或length 不合法。
范例
参考mmap（）