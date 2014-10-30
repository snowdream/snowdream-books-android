srand（设置随机数种子）
<pre>相关函数
rand，random srandom
表头文件
#include< stdlib.h>
定义函数
void srand (unsigned int seed);
函数说明
srand()用来设置rand()产生随机数时的随机数种子。参数seed必须是个整数，通常可以利用geypid()或time(0)的返回值来当做seed。如果每次seed都设相同值，rand()所产生的随机数值每次就会一样。
返回值

范例
/* 产生介于1 到10 间的随机数值，此范例与执行结果可与rand（）参照*/
#include< time.h>
#include< stdlib.h>
main()
{
int i,j;
srand((int)time(0));
for(i=0;i<10;i++)
{
j=1+(int)(10.0*rand()/(RAND_MAX+1.0));
printf(“ %d “,j);
}
}
执行
5 8 8 8 10 2 10 8 9 9
2 9 7 4 10 3 2 10 8 7</pre>