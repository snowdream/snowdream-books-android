sin（取正玄函数值）
相关函数
acos，asin，atan，atan2，cos，tan
表头文件
#include<math.h>
定义函数
double sin(double x);
函数说明
sin（）用来计算参数x的正玄值，然后将结果返回。
返回值
返回-1 至1之间的计算结果。
附加说明
使用GCC编译时请加入-lm。
范例
#include<math.h>
main()
{
double answer = sin (0.5);
printf("sin(0.5) = %f\n",answer);
}
执行
sin(0.5) = 0.479426