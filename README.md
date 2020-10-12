# STL
a kind of tool help to change STL into Simulink
输入格式

公式名，信号名命名：字母开头，字母和下划线的组合

公式名=STL公式
Signalname(t)_pert=实数    -------信号的扰动

STL公式：AND OR IMPLY FGU_[a,b] a,b是正实数
Signalname(t) > < >= <= 实数，t是时间变量

eg: formula werr
werr = G_[a,b] ((s(t)>1 OR F_[0.2,3] r(t)<=-0.2))
s(t)_pert = 0.9
r(t)_pert = 2

the parse tree is like
