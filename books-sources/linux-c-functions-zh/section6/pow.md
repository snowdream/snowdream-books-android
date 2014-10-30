pow（计算次方值）
<pre>相关函数
exp，log，log10
表头文件
#include< math.h>
定义函数
double pow(double x,double y);
函数说明
pow()用来计算以x为底的y次方值，即xy值，然后将结果返回。
返回值
返回x的y次方计算结果。
错误代码
EDOM 参数x为负数且参数y不是整数。
附加说明
使用GCC编译时请加入-lm。
范例
#include < math.h>
main()
{
double answer;
answer =pow(2,10);
printf("2^10 = %f\n", answer);
}
执行
2^10 = 1024.000000</pre>