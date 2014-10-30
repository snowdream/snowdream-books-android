atan（取反正切函数值）
<pre>相关函数
acos，asin，atan2，cos，sin，tan
表头文件
#include< math.h>
定义函数
double atan(double x);
函数说明
atan()用来计算参数x的反正切值，然后将结果返回。
返回值
返回-PI/2至PI/2之间的计算结果。
附加说明
使用GCC编译时请加入-lm
范例
#include< math.h>
main()
{
double angle;
angle =atan(1);
printf("angle = %f\n",angle);
}
执行
angle = 1.570796</pre>