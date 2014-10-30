sinh（取双曲线正玄函数值）
相关函数
cosh，tanh
表头文件
#include<math.h>
定义函数
double sinh( double x);
函数说明
sinh()用来计算参数x的双曲线正玄值，然后将结果返回。数学定义式为:(exp(x)-exp(-x))/2。
返回值
返回参数x的双曲线正玄值。
附加说明
使用GCC编译时请加入-lm。
范例
#include<math.h>
main()
{
double answer = sinh (0.5);
printf("sinh(0.5) = %f\n",answer);
}
执行
sinh(0.5) = 0.521095