ceil（取不小于参数的最小整型数）
<pre>相关函数
fabs
表头文件
#include < math.h>
定义函数
double ceil (double x);
函数说明
ceil()会返回不小于参数x的最小整数值，结果以double形态返回。
返回值
返回不小于参数x的最小整数值。
附加说明
使用GCC编译时请加入-lm。
范例
#include< math.h>
main()
{
double value[ ]={4.8,1.12,-2.2,0};
int i;
for (i=0;value[i]!=0;i++)
printf("%f=>%f\n",value[i],ceil(value[i]));
}
执行
4.800000=>5.000000
1.120000=>2.000000
-2.200000=>-2.000000</pre>