acos（取反余弦函数数值）
相关函数
asin , atan , atan2 , cos , sin , tan
表头文件
#include <math.h>
定义函数
double acos (double x);
函数说明
acos()用来计算参数x的反余弦值，然后将结果返回。参数x范围为－1至1之间，超过此范围则会失败。
返回值
返回0至PI之间的计算结果，单位为弧度，在函数库中角度均以弧度来表示。
错误代码
EDOM参数x超出范围。
附加说明
使用GCC编译时请加入－lm。
范例
#include <math.h>
main (){
double angle;
angle = acos(0.5);
printf("angle = %f\n", angle);
}
执行
angle = 1.047198