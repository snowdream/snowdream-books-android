free（释放原先配置的内存）
相关函数
malloc，calloc，realloc，brk
表头文件
#include<stdlib.h>
定义函数
void free(void *ptr);
函数说明
参数ptr为指向先前由malloc()、calloc()或realloc()所返回的内存指针。调用free()后ptr所指的内存空间便会被收回。假若参数ptr所指的内存空间已被收回或是未知的内存地址，则调用free()可能会有无法预期的情况发生。若参数ptr为NULL，则free()不会有任何作用。