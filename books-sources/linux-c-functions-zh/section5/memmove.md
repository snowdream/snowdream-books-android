memmove（拷贝内存内容）
<pre>相关函数
bcopy，memccpy，memcpy，strcpy，strncpy
表头文件
#include< string.h>
定义函数
void * memmove(void *dest,const void *src,size_t n);
函数说明
memmove()与memcpy()一样都是用来拷贝src所指的内存内容前n个字节到dest所指的地址上。不同的是，当src和dest所指的内存区域重叠时，memmove()仍然可以正确的处理，不过执行效率上会比使用memcpy()略慢些。
返回值
返回指向dest的指针。
附加说明
指针src和dest所指的内存区域可以重叠。
范例
参考memcpy()。</pre>