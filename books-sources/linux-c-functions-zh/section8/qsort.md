qsort（利用快速排序法排列数组）
<pre>相关函数
bsearch
表头文件
#include< stdlib.h>
定义函数
void qsort(void * base,size_t nmemb,size_t size,int ( * compar)(const void *, const void *));
函数说明
参数base指向欲排序的数组开头地址，参数nmemb代表数组中的元素数量，每一元素的大小则由参数size决定，最后一项参数compar为一函数指针，这个函数用来判断两个元素间的大小关系，若传给compar的第一个参数所指的元素数据大于第二个参数所指的元素数据则必须回传大于零的值，两个元素数据相等则回传0。
返回值

附加说明

范例
#define nmemb 7
#include < stdlib.h>
int compar (const void *a ,const void *b)
{
int *aa=(int * ) a,*bb = (int * )b;
if( * aa >* bb)return 1;
if( * aa == * bb) return 0;
if( * aa < *bb) return -1;
}
main( )
{
int base[nmemb]={ 3,102,5,-2,98,52,18};
int i;
for ( i=0; i<nmemb;i++)
printf(“%d “,base[i]);
printf(“\n”);
qsort(base,nmemb,sizeof(int),compar);
for(i=0;i<nmemb;i++)
printf(“%d”base[i]);
printf(“\n”);
}
执行
3 102 5 -2 98 52 18
-2 3 5 18 52 98 102</pre>