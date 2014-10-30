lfind（线性搜索）
<pre>相关函数
lsearch
表头文件
#include< stdlib.h>
定义函数
void *lfind (const void *key,const void *base,size_t *nmemb,size_t
size,int(* compar) (const void * ,const void *));
函数说明
lfind()利用线性搜索在数组中从头至尾一项项查找数据。参数key指向欲查找的关键数据，参数base指向要被搜索的数组开头地址，参数nmemb代表数组中的元素数量，每一元素的大小则由参数size决定，最后一项参数compar为一函数指针，这个函数用来判断两个元素是否相同，若传给compar 的异地个参数所指的元素数据和第二个参数所指的元素数据相同时则返回0，两个元素数据不相同则返回非0值。Lfind()与lsearch()不同点在于，当找不到关键数据时lfind()仅会返回NULL，而不会主动把该笔数据加入数组尾端。
返回值
找到关键数据则返回找到的该笔元素的地址，如果在数组中找不到关键数据则返回空指针(NULL)。
范例
参考lsearch()。</pre>