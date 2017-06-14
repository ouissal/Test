var app=angular.module("myApp",[]);
app.controller("ProduitController",function($scope,$http){
	$scope.produits=null;
	
	$scope.valider = function(){
		$http.get('http://localhost:8181/data?question=question1&response='+$scope.selectedProduct)
		.success(function(data){
			console.log(data);
		})
		
		.error(function(err){
			console.log(err);
		})
		
		$http.get('http://localhost:8181/data?question=question2&response='+$scope.selectedProduct2)
		.success(function(data){
			console.log(data);
		})
		
		.error(function(err){
			console.log(err);
		})
		
		//alert($scope.selectedProduct);
		//alert($scope.selectedProduct2);
	};
	
		$http.get('http://localhost:8181/produits')
		.success(function(data){
			$scope.produits =data;
			console.log(data);
		})
		
		.error(function(err){
			console.log(err);
		})
	
 
}); 