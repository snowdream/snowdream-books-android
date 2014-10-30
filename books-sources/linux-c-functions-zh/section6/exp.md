exp（计算指数）
<pre>相关函数
log，log10，pow
表头文件
#include< math.h>
定义函数
double exp(double x);
函数说明
exp()用来计算以e为底的x次方值，即ex值，然后将结果返回。
返回值
返回e的x次方计算结果。
附加说明
使用GCC编译时请加入-lm。
范例
#include< math.h>
main()
{
double answer;
answer = exp (10);
printf("e^10 =%f\n", answer);
}
执行
e^10 = 22026.465795</pre>