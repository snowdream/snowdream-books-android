sqrt（计算平方根值）
<pre>相关函数
hypotq
表头文件
#include< math.h>
定义函数
double sqrt(double x);
函数说明
sqrt()用来计算参数x的平方根，然后将结果返回。参数x必须为正数。
返回值
返回参数x的平方根值。
错误代码
EDOM 参数x为负数。
附加说明
使用GCC编译时请加入-lm。
范例
/* 计算200的平方根值*/
#include< math.h>
main()
{
double root;
root = sqrt (200);
printf("answer is %f\n",root);
}
执行
answer is 14.142136</pre>