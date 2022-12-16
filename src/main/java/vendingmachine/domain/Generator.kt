package vendingmachine.domain

import camp.nextstep.edu.missionutils.Randoms
import vendingmachine.values.Coin

class Generator {

    fun makeMachineCoinList(amount: Int): MutableList<Coin> {
        var sum = 0
        val coinList: MutableList<Coin> = mutableListOf()
        Coin.values().forEach { coinList.add(it) }
        val coinIndexList: MutableList<Int> = mutableListOf()
        repeat(coinList.size) { coinIndexList.add(it) }
        while (true) {
            val coinIndex = Randoms.pickNumberInList(coinIndexList)
            if (coinList[coinIndex].amount + sum <= amount) {
                coinList[coinIndex].count++
                sum += coinList[coinIndex].amount
            }
            if (sum == amount) break
        }
        return coinList
    }

}