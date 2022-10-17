/**
 * 
 */

// object literal

var toko = {
	name : "Sumber Jaya",
	karyawan : 50,
	penghasilan : "1 B"
}
toko.name = "Jaya Agung"
for(var item in toko){
	console.log(item+" "+ toko[item])
	
}

function tokoFunc(name, karyawan, penghasilan){
	result={};
	result.name = name;
	result.karyawan = karyawan;
	result.penghasilan = penghasilan;
	return result;
}

function tokoConst(name, karyawan, penghasilan){
	this.name = name;
	this.karyawan = karyawan;
	this.penghasilan = penghasilan;
}

tokoConst1 = new tokoConst("Sugeng Makmur", 80, 300000000)

// prototype

function camilan(name, price){
	this.name = name;
	this.price = price;
	this.total = function(){
		diskon = (this.price * this.diskon) / 100
		result = this.price - diskon
		return result;
	};
}

let beli = new camilan("Citos", 5000)

camilan.prototype.diskon = function(diskon){
	result = (this.price * diskon) / 100
	return result;
}

let beli2 = new camilan("Makaroni", 10000)

