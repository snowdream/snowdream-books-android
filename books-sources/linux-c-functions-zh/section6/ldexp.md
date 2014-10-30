ldexp（计算2的次方值）
<pre>相关函数
frexp
表头文件
#include< math.h>
定义函数
double ldexp(double x,int exp);
函数说明
ldexp()用来将参数x乘上2的exp次方值，即x*2exp。
返回值
返回计算结果。
附加说明
使用GCC编译时请加入-lm。
范例:
/* 计算3*(2^2)＝12 */
#include< math.h>
main()
{
int exp;
double x,answer;
answer = ldexp(3,2);
printf("3*2^(2) = %f\n",answer);
}
执行
3*2^(2) = 12.000000</pre>