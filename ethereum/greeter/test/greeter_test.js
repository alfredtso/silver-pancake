// Truffle can load and interact with contracts compiled with artifact.require
const GreeterContract = artifacts.require("Greeter");

contract("Greeter", (accounts) => {
	it("has been deployed succesfully", async () => {
		const greeter = await GreeterContract.deployed();
		assert(greeter, "contract was not deployed");
	});

	describe('greet()', () => {
		it('returns Hello world', async () => {
			const greeter = await GreeterContract.deployed();
			const expected = "Hello, World!";
			const actual = await greeter.greet();

			assert.equal(actual, expected, "greeted with 'Hello, World!");
		});
	});

	describe('owner()', () => {
		it('return the address of the owner', async () => {
			const greeter = await GreeterContract.deployed();
			const owner = await greeter.owner();

			assert(owner, "current owner");
		});	

		it("matches the address that deployed the contract", async () => {
			const greeter = await GreeterContract.deployed();
			const owner = await greeter.owner();
			const expected = accounts[0];

			assert.equal(owner, expected, "the addresses doesn't match");
		});
	});
});


contract("Greeter: update greeting", () => {
	describe("setGreeting(string)", () => {
		it("sets greeting to passed in string", async () => {
			const greeter = await GreeterContract.deployed()
			const expected = "Hi there!";

			await greeter.setGreeting(expected);
			const actual = await greeter.greet();

			assert.equal(actual, expected, "greeting was not updated");
		});
	});
});
