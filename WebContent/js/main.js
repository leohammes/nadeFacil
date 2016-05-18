/**
 * You must include the dependency on 'ngMaterial' 
 */
angular.module('BlankApp', ['ngMaterial', 'ui.bootstrap'])
.controller('IndexCtrl', function($scope, $interval, $timeout) {
    $scope.slideShowIndex = 1;
    $scope.slideShowInterval = 3000;
    $scope.slides = [
      {
        image: '/image/slide-show-1.jpg'
      },
      {
        image: '/image/slide-show-2.jpg'
      },
      {
        image: '/image/slide-show-3.jpg'
      }
    ];
    
    $timeout(function() {
    	$(".left.carousel-control").click(function(event) {
        	event.preventDefault();
        	if ($scope.slideShowIndex == 1) {
        		$scope.slideShowIndex = 3;
        	} else {
        		$scope.slideShowIndex--;
        	}
        	$($(".carousel-indicators .ng-scope")[$scope.slideShowIndex - 1]).click();
        	
        	clearInterval($scope.carouselInterval);
        	$scope.carouselInterval = carouselInterval();
        })
        
        $(".right.carousel-control").click(function(event) {
        	event.preventDefault();
        	if ($scope.slideShowIndex == 3) {
        		$scope.slideShowIndex = 1;
        	} else {
        		$scope.slideShowIndex++;
        	}
        	$($(".carousel-indicators .ng-scope")[$scope.slideShowIndex - 1]).click();
        	
        	clearInterval($scope.carouselInterval);
        	$scope.carouselInterval = carouselInterval();
        })
    });
    
    
    $scope.carouselInterval = carouselInterval();
    
    function carouselInterval() {
    	return setInterval(function() {
        	if ($scope.slideShowIndex == 3) {
        		$scope.slideShowIndex = 1;
        	} else {
        		$scope.slideShowIndex++
        	}
        	$($(".carousel-indicators .ng-scope")[$scope.slideShowIndex - 1]).click();
        }, $scope.slideShowInterval);
    }
});