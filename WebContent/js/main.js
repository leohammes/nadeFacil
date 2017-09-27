/**
 * You must include the dependency on 'ngMaterial' 
 */
angular.module('BlankApp', ['ngMaterial', 'ui.bootstrap'])
.controller('IndexCtrl', function($scope, $element, $interval, $timeout) {
    $scope.slideShowIndex = 1;
    $scope.slideShowInterval = 3000;
    $scope.slides = [
      {
        image: '/images/?file=slide-show-1.jpg'
      },
      {
        image: '/images/?file=slide-show-2.jpg'
      },
      {
        image: '/images/?file=slide-show-3.jpg'
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
    		if (!$element.attr('static')) {
	        	if ($scope.slideShowIndex == 3) {
	        		$scope.slideShowIndex = 1;
	        	} else {
	        		$scope.slideShowIndex++
	        	}
	        	$($(".carousel-indicators .ng-scope")[$scope.slideShowIndex - 1]).click();
    		}
        }, $scope.slideShowInterval);
    }
});