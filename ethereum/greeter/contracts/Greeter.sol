pragma solidity >= 0.4.0 < 0.7.0;

import "@openzeppelin/contracts/access/Ownable.sol";

contract Greeter is Ownable {

	string private _greeting = "Hello, World!";


	function greet() external view returns(string memory) {
		return _greeting;
	}

	function setGreeting(string calldata myString) external onlyOwner {
		_greeting = myString;
	}

	/** Not needed coz of Ownable
	constructor() public {
		_owner = msg.sender;
	}

	modifier onlyOwner() {
		require(
				msg.sender == _owner,
				"Ownable: caller is not the owner"
			   );
		_;
	}

	address private _owner;

	function owner() public view returns(address) {
		return _owner;
	}
	*/

}

