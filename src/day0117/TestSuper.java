package day0117;

/**
 *  특정 클래스만 자식클래스로 등록할 때 sealed와 permits 사용
 */

public sealed class TestSuper permits Test1, Test2 {

}	// class