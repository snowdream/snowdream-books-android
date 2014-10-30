rand（产生随机数）
<pre>相关函数
srand，random，srandom
表头文件
#include< stdlib.h>
定义函数
int rand(void)
函数说明
rand()会返回一随机数值，范围在0至RAND_MAX 间。在调用此函数产生随机数前，必须先利用srand()设好随机数种子，如果未设随机数种子，rand()在调用时会自动设随机数种子为1。关于随机数种子请参考srand()。
返回值
返回0至RAND_MAX之间的随机数值，RAND_MAX定义在stdlib.h，其值为2147483647。
范例
/* 产生介于1 到10 间的随机数值，此范例未设随机数种子，完整的随机数产生请参考
srand（）*/
#include< stdlib.h>
main()
{
int i,j;
for(i=0;i<10;i++)
{
j=1+(int)(10.0*rand()/(RAND_MAX+1.0));
printf(“%d “,j);
}
}
执行
9 4 8 8 10 2 4 8 3 6
9 4 8 8 10 2 4 8 3 6</pre>