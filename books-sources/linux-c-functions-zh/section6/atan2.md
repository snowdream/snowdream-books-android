atan2（取得反正切函数值）
相关函数
acos，asin，atan，cos，sin，tan
表头文件
#include<math.h>
定义函数
double atan2(double y,double x);
函数说明
atan2()用来计算参数y/x的反正切值，然后将结果返回。
返回值
返回-PI 至PI 之间的计算结果。
附加说明
使用GCC编译时请加入-lm。
范例
#include<math.h>
main()
{
double angle;
angle = atan2(1,2);
printf("angle = %f\n", angle);
}
执行
angle = 0.463648