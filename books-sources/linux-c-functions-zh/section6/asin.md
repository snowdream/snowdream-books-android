asin（取反正弦函数值）
相关函数
acos , atan , atan2 , cos , sin , tan
表头文件
#include <math.h>
定义函数
double asin (double x)
函数说明
asin()用来计算参数x的反正弦值，然后将结果返回。参数x范围为－1至1之间，超过此范围则会失败。
返回值
返回－PI/2之PI/2之间的计算结果。
错误代码
EDOM参数x超出范围
附加说明
使用GCC编译时请加入－lm
范例
#include<math.h>
main()
{
double angle;
angle = asin (0.5);
printf("angle = %f\n",angle);
}
执行
angle = 0.523599