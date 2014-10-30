
log（计算以e 为底的对数值）
<pre>相关函数
exp，log10，pow
表头文件
#include < math.h>
定义函数
double log (double x);
函数说明
log（）用来计算以e为底的x 对数值，然后将结果返回。
返回值
返回参数x的自然对数值。
错误代码
EDOM 参数x为负数，ERANGE 参数x为零值，零的对数值无定义。
附加说明
使用GCC编译时请加入-lm。
范例
#include< math.h>
main()
{
double answer;
answer = log (100);
printf("log(100) = %f\n",answer);
}
执行
log(100) = 4.605170</pre>