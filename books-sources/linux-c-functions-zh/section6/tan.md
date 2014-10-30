tan（取正切函数值）
相关函数
atan，atan2，cos，sin
表头文件
#include <math.h>
定义函数
double tan(double x);
函数说明
tan()用来计算参数x的正切值，然后将结果返回。
返回值
返回参数x的正切值。
附加说明
使用GCC编译时请加入-lm。
范例
#include<math.h>
main()
{
double answer = tan(0.5);
printf("tan (0.5) = %f\n",answer);
}
执行
tan(0.5) = 0.546302