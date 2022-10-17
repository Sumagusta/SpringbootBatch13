/**
 * 
 */

var data1 = 20;
	var data1 = 15;

	let data2 = 40;
	let data3 = 45;

	const data4 = 40;
	//data4 = 50;

	console.log(data1);
	console.log(data2);

	// function
	function funct() {
		alert("Selamat Datang");
	}

	function returnFunct() {
		return 40
	}

	function hitung(nilai1, nilai2, nilai3) {
		nilai1 = returnFunct();
		document.write("<p> (" + nilai1 + " x " + nilai2 + ") /" + nilai3
				+ " =  <b>" + (nilai1 * nilai2) / nilai3 + "</b> </p>")
	}
	
	function strict(a, b){
		console.log(a==b)
		console.log(a===b)
	}
	
	function indexOfJs(){
		
		var data = "selamat pagi, sobat"
		console.log(data.indexOf("a",10))
	}
	
	function sliceJs(){
		
		var buah = ['anggur', 'mangga', 'jeruk']
		result1 = buah.slice(1)
		result2 = buah.slice(0, 1)
		
		console.log("1 param "+result1)
		console.log("2 param "+result2)
	}
	
	function spliceJs(){
		var buah = ['anggur', 'mangga', 'jeruk', 'nanas', 'semangka']
		
		console.log(buah.splice(2, 1, 'melon', 'apel'))
		
		console.log(buah);
	}
	
	function filterData(){
		var data = ['adi', 'adi', 'sulis', 'rahmad', 'adi']
		
		filterData = 'adi'
		
		var result = data.filter(item => filterData.includes(item))
		
		return result;
	}
	
	function foreach(){
		var data = ['adi', 'adi', 'sulis', 'rahmad', 'adi']
		
		var store = []
		
		data.forEach(item=>store.push(item))
		
		return store;
	}
	
	