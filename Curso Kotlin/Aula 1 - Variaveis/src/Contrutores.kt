class Casa {

    //Propriedades
    var cor: String
    var vagasGaragem: Int

    constructor(cor: String, vagasGaragem: Int){
        this.cor = cor
        this.vagasGaragem = vagasGaragem
    }

    fun detalhesCasa(){
        println("A casa tem a cor: $cor e $vagasGaragem vagas de garagem.")
    }

}