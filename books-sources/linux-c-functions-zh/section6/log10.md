log10（计算以10 为底的对数值）
<pre>相关函数
exp，log，pow
表头文件
#include< math.h>
定义函数
double log10(double x);
函数说明
log10()用来计算以10为底的x对数值，然后将结果返回。
返回值
返回参数x以10为底的对数值。
错误代码
EDOM参数x为负数。RANGE参数x为零值，零的对数值无定义。
附加说明
使用GCC编译时请加入-lm。
范例
#include< math.h>
main()
{
double answer;
answer = log10(100);
printf("log10(100) = %f\n",answer);
}
执行
log10(100) = 2.000000</pre>