cosh（取双曲线余玄函数值）
<pre>相关函数
sinh，tanh
表头文件
#include< math.h>
定义函数
double cosh(double x);
函数说明
cosh()用来计算参数x的双曲线余玄值，然后将结果返回。数学定义式为:(exp(x)+exp(-x))/2。
返回值
返回参数x的双曲线余玄值。
附加说明
使用GCC编译时请加入-lm。
范例
#include< math.h>
main()
{
double answer = cosh(0.5);
printf("cosh(0.5) = %f\n",answer);
}
执行
cosh(0.5) = 1.127626</pre>