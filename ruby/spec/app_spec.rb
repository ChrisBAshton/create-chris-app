require './app'

RSpec.describe App, "says hello world" do
  it "says hello" do
    app = App.new
    expect(app.hello).to eq "Hello world"
  end

  it "says hello to a specific person" do
    app = App.new
    expect(app.hello "Chris").to eq "Hello Chris"
  end
end
