#language:zh-CN
功能: 酒店世界时钟招式
  为了能尽量容易地调整酒店大堂里不同城市的时钟时间，
  作为酒店雇员，
  我想调整任一城市的时钟的时间后，其余城市的时钟的时间自动调整。

  场景: 将北京的时钟的时间调整正确
    假如 一个酒店大堂有五个城市的时钟
    并且 "伦敦"正实行夏时制
    并且 "纽约"正实行夏时制
    并且 "北京"未实行夏时制
    并且 "莫斯科"未实行夏时制
    并且 "悉尼"未实行夏时制
    当 我将"北京"的时钟的时间调整到9
    那么 城市"北京"的时钟的时间应该是9
    并且 城市"伦敦"的时钟的时间应该是2
    并且 城市"莫斯科"的时钟的时间应该是5
    并且 城市"悉尼"的时钟的时间应该是11
    并且 城市"纽约"的时钟的时间应该是21

  场景: 伦敦的夏时制结束了
    假如 一个酒店大堂有五个城市的时钟
    并且 城市"伦敦"的夏时制结束了
    并且 城市"纽约"的夏时制尚未结束
    并且 "北京"未实行夏时制
    并且 "莫斯科"未实行夏时制
    并且 "悉尼"未实行夏时制
    当 我将"伦敦"的时钟的时间调整到0，因为夏时制结束了
    那么 城市"北京"的时钟的时间应该是8
    并且 城市"伦敦"的时钟的时间应该是0
    并且 城市"莫斯科"的时钟的时间应该是4
    并且 城市"悉尼"的时钟的时间应该是10
    并且 城市"纽约"的时钟的时间应该是20
